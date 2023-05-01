import { Helmet } from 'react-helmet-async';
// @mui
import { useTheme } from '@mui/material/styles';
import { Grid, Container, Typography, Input, Button, Snackbar, Alert } from '@mui/material';
// components
// sections
import {
  AppCurrentVisits,
  AppWidgetSummary,
  AppConversionRates,
} from '../sections/@dashboard/app';
import { useEffect, useState } from 'react';
import DataService from '../service/dataService';

// ----------------------------------------------------------------------

export default function DashboardAppPageStudent() {
  const theme = useTheme();

  const [student, setStudent] = useState([])

  const loadStudents = () => {
    DataService.listAllStudents().then((response) => {
      setStudent(response)
    })
  }

  useEffect(() => {
    loadStudents()
  }, [])

  const countByGroup = function (list, key) {
    return list.reduce(function (returnedValue, eachStudent ) {
      const identifiedGroup = returnedValue.find(e => eachStudent[key] === e.label) || { "label": eachStudent[key], "value": 0 };
      if (identifiedGroup.value === 0) returnedValue.push(identifiedGroup);
      identifiedGroup.value++;
      return returnedValue;
    }, []);
  };
// key:atributo

  const [file, setFile] = useState()
  
  const handleFileChange = (e) => {
    if (e.target.files) {
      setFile(e.target.files[0]);
    }
  };

  const [snack, setSnack] = useState(false)
  const [snackMessage, setSnackMessage] = useState("")
  const [severity, setSeverity] = useState()
  
  const handleUploadClick = () => {
    if (!file) {
      return;
    }
    DataService.uploadFileStudents(file)
    .then((res) => {
      res.status === 200 ? setSeverity("success") : setSeverity("error");
      return res.text()
    })
    .then((text) => {
      setSnackMessage(text);
      loadStudents();
    })
    .catch((err) => {
      setSnackMessage(err)
    });
  setSnack(true)
  };
  
  const handleClose = (event, reason) => {
    if (reason === 'clickaway') {
      return;
    }
    setSnack(false);
  };

  return (
    <>
      <Helmet>
        <title> Dashboard MCIO</title>
      </Helmet>

      <Snackbar open={snack}
        anchorOrigin={{ horizontal: "right", vertical: "top" }}
        autoHideDuration={6000}
        onClose={handleClose} >
        <Alert onClose={handleClose} severity={severity}>
          {snackMessage}
        </Alert>
      </Snackbar>

      <Container maxWidth="xl">

        <Grid container spacing={3}>
          <Grid item xs={12} sm={6} md={4}>
            <Typography variant="h4" sx={{ mb: 5 }}>
              Dashboard Alunas
            </Typography>
          </Grid>

          <Grid item xs={12} sm={6} md={4}>
            <Input disableUnderline={true} type="file" onChange={handleFileChange} />
          </Grid >
          <Grid item xs={12} sm={6} md={4}>
            <Button variant="contained" onClick={handleUploadClick}>
              Upload de Novos Contatos
            </Button>
          </Grid>

          <Grid item xs={12} sm={6} md={6}>
            <AppWidgetSummary title="Total de Alunas" total={student.length} />
          </Grid>


          <Grid item xs={12} sm={6} md={6}>
            <AppWidgetSummary title="Contratadas por Parceiros" total={student.length} color="warning" />
          </Grid>

          <Grid item xs={12} md={6} lg={4}>
            <AppCurrentVisits
              title="Localização das Alunas/Países"
              chartData={countByGroup(student, "xvPaisAluna")}
              chartColors={[
                theme.palette.primary.main,
                theme.palette.info.main,
                theme.palette.warning.main,
                theme.palette.error.main,
              ]}
            />
          </Grid>

          <Grid item xs={12} md={6} lg={8}>
            <AppConversionRates
              title="Localização das Alunas/Brasil"
              chartData={countByGroup(student.filter(student => student.xvPaisAluna === "Brasil"), "xvUfAluna")}
            />
          </Grid>

          <Grid item xs={12} md={6} lg={8}>
            <AppConversionRates
              title="Escolaridade"
              chartData={countByGroup(student, "xvGrauEscolaridadeAluna")}
            />
          </Grid>
          <Grid item xs={12} md={6} lg={4}>
            <AppCurrentVisits
              title="Origem da Inscrição"
              chartData={countByGroup(student, "xvOrigeminsc")}
              chartColors={[
                theme.palette.primary.main,
                theme.palette.info.main,
                theme.palette.warning.main,
                theme.palette.error.main,
              ]}
            />
          </Grid>
        </Grid>
      </Container>
    </>
  );
}
