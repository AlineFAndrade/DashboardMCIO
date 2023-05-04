import { Helmet } from 'react-helmet-async';
import { useTheme } from '@mui/material/styles';
import { Grid, Container, Typography, Input, Button, Snackbar, Alert } from '@mui/material';
import {
  AppCurrentVisits,
  AppWidgetSummary,
  AppConversionRates,
} from '../sections/@dashboard/app';
import { useEffect, useState } from 'react';
import DataService from '../service/dataService';

export default function DashboardAppPageAssociated() {
  const theme = useTheme();

  const [associated, setAssociated] = useState([])

  const loadAssociated = () => {
    DataService.listAllAssociated().then((response) => {
      setAssociated(response)
    })
  }

  useEffect(() => {
    loadAssociated()
  }, [])

  const countByGroup = function (list, key) {
    return list.reduce(function (returnedValue, eachAssociated) {
      const identifiedGroup = returnedValue.find(e => eachAssociated[key] === e.label) || { "label": eachAssociated[key], "value": 0 };
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
    DataService.uploadFileAssociated(file)
      .then((res) => {
        res.status === 200 ? setSeverity("success") : setSeverity("error");
        return res.text()
      })
      .then((text) => {
        setSnackMessage(text);
        loadAssociated();
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
              Dashboard Associadas
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
            <AppWidgetSummary title="Total de Associadas" total={associated.length} />
          </Grid>


          <Grid item xs={12} sm={6} md={6}>
            <AppWidgetSummary title="Entradas no último mês" total={2} color="warning" />
          </Grid>

          <Grid item xs={12} md={6} lg={4}>
            <AppCurrentVisits
              title="Localização das Associadas/Países"
              chartData={countByGroup(associated, "xvPais")}
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
              title="Localização das Associadas/Brasil"
              chartData={countByGroup(associated.filter(associated => associated.xvPais === "Brasil"), "xvUf")}
            />
          </Grid>

          <Grid item xs={12} md={6} lg={8}>
            <AppConversionRates
              title="Segmento"
              chartData={countByGroup(associated, "xvSegmento")}
            />
          </Grid>
          <Grid item xs={12} md={6} lg={4}>
            <AppCurrentVisits
              title="Pilar MCIO"
              chartData={countByGroup(associated, "xvPilarMcio")}
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
