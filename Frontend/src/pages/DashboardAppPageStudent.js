import { Helmet } from 'react-helmet-async';
// @mui
import { useTheme } from '@mui/material/styles';
import { Grid, Container, Typography, Input, Button } from '@mui/material';
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

  useEffect(() => {
    DataService.listAllStudents().then((response) => {
      setStudent(response)
      console.log(student[0].name, "oi")
    })
  }, [])

  const [file, setFile] = useState()

  const handleFileChange = (e) => {
    if (e.target.files) {
      setFile(e.target.files[0]);
    }
  };

  const handleUploadClick = () => {
    if (!file) {
      return;
    }
    DataService.uploadFile(file)
      .then((res) => res.json())
      .then((data) => console.log(data))
      .catch((err) => console.error(err));
    console.log(file)
  };

  return (
    <>
      <Helmet>
        <title> Dashboard MCIO</title>
      </Helmet>

      <Container maxWidth="xl">

        <Grid container spacing={3}>
          <Grid item xs={12} sm={6} md={6}>
            <Typography variant="h4" sx={{ mb: 5 }}>
              Dashboard Alunas
            </Typography>
          </Grid>

          <Grid item xs={12} sm={6} md={6}>
            <Input disableUnderline={true} type="file" onChange={handleFileChange} />
            <Button variant="contained" onClick={handleUploadClick}>
              Upload
            </Button>
          </Grid>

          <Grid item xs={12} sm={6} md={6}>
            <AppWidgetSummary title="Total de Alunas" total={714} />
          </Grid>


          <Grid item xs={12} sm={6} md={6}>
            <AppWidgetSummary title="Contratadas por Parceiros" total={1723315} color="warning" />
          </Grid>

          <Grid item xs={12} md={6} lg={4}>
            <AppCurrentVisits
              title="Localização das Alunas/Países"
              chartData={[
                { label: 'America', value: 4344 },
                { label: 'Asia', value: 5435 },
                { label: 'Europe', value: 1443 },
                { label: 'Africa', value: 4443 },
              ]}
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
              subheader="(+43%) than last year"
              chartData={[
                { label: 'Italy', value: 400 },
                { label: 'Japan', value: 430 },
                { label: 'China', value: 448 },
                { label: 'Canada', value: 470 },
                { label: 'France', value: 540 },
                { label: 'Germany', value: 580 },
                { label: 'South Korea', value: 690 },
                { label: 'Netherlands', value: 1100 },
                { label: 'United States', value: 1200 },
                { label: 'United Kingdom', value: 1380 },
              ]}
            />
          </Grid>

          <Grid item xs={12} md={6} lg={8}>
            <AppConversionRates
              title="Escolaridade"
              subheader="(+43%) than last year"
              chartData={[
                { label: 'Italy', value: 400 },
                { label: 'Japan', value: 430 },
                { label: 'China', value: 448 },
                { label: 'Canada', value: 470 },
                { label: 'France', value: 540 },
                { label: 'Germany', value: 580 },
                { label: 'South Korea', value: 690 },
                { label: 'Netherlands', value: 1100 },
                { label: 'United States', value: 1200 },
                { label: 'United Kingdom', value: 1380 },
              ]}
            />
          </Grid>
          <Grid item xs={12} md={6} lg={4}>
            <AppCurrentVisits
              title="Origem da Inscrição"
              chartData={[
                { label: 'America', value: 4344 },
                { label: 'Asia', value: 5435 },
                { label: 'Europe', value: 1443 },
                { label: 'Africa', value: 4443 },
              ]}
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
