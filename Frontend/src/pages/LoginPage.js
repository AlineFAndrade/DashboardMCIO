import { Helmet } from 'react-helmet-async';
// @mui
import { styled } from '@mui/material/styles';
import { Link, Container, Typography, Divider, Stack, Button, Grid, Backdrop, CircularProgress, Box } from '@mui/material';
// hooks
import useResponsive from '../hooks/useResponsive';
// components
import Logo from '../components/logo';
import Iconify from '../components/iconify';
// sections
import { LoginForm } from '../sections/auth/login';

// ----------------------------------------------------------------------

const StyledRoot = styled('div')(({ theme }) => ({
  [theme.breakpoints.up('md')]: {
    display: 'flex',
  },
}));

const StyledSection = styled('div')(({ theme }) => ({
  width: '100%',
  maxWidth: 480,
  display: 'flex',
  flexDirection: 'column',
  justifyContent: 'center',
  boxShadow: theme.customShadows.card,
  backgroundColor: theme.palette.background.default,
}));

const StyledContent = styled('div')(({ theme }) => ({
  maxWidth: 480,
  margin: 'auto',
  minHeight: '100vh',
  display: 'flex',
  justifyContent: 'center',
  flexDirection: 'column',
  padding: theme.spacing(12, 0),
}));

// ----------------------------------------------------------------------
export default function LoginPage() {
  const mdUp = useResponsive('up', 'md');

  return (
    <>
      <Helmet>
        <title> Login | MCIO </title>
      </Helmet>
      <StyledRoot>
 
         {mdUp && 
 (

          <StyledContent style={{height: '724px', width: '250.65', left: '128.82',top: '1px',position: 'absolute', left: '3.95%',right: '69.79%',top: '0.1%', bottom: '-0.1%', background: 'linear-gradient( 180.43deg, #FFFFFF -8.72%, #CCCCCC 122.19%)', boxShadow: '0px 0px 10px 2px rgba(0,0,0,0.25)' }} >
      

              <img src="/assets/illustrations/telamcio.png" alt="login" />
                                
            <div sx={{display: 'flex', justifyContent: 'flex', alignItems: 'center'}}>
              <Typography variant="h4" noWrap sx={{  left: '12.26%', right: '56.28%', top: '25.67%', bottom: '69.54%', textAlign: 'center', color: '#002F9C', fontStyle: 'normal', fontWeight:400, fontSize: '40.4589px', lineHeight: '49px',textAlign: 'center', fontFamily: 'Inter, sans-serif',color: 'red'}}>
            
              <p> Mulheres na Tecnologia </p>
              </Typography> 
              </div>
              
              <img src="/assets/illustrations/seta.png" alt="seta" />
              
            <div sx={{display: 'flex', justifyContent: 'center', alignItems: 'center', fontFamily: 'Inter, sans-serif'}}>
              <Typography variant="h4"  sx={{ left: '13.92%', right: '57.19%', top: '83.95%', bottom: '10.88%', textAlign: 'center', color: '#002F9C', fontStyle: 'normal', fontWeight:400, fontSize: '43px', lineHeight: '53px'}}>
              Quando mulheres
              </Typography> 
              <Typography variant="h3"  sx={{ left: '13.92%', right: '69.06%', top: '77.42%', bottom: '15.35%', textAlign: 'center', color: '#002F9C', fontStyle: 'normal', fontWeight:400, fontSize: '61.0273px', lineHeight: '74px'}}>
              se unem
              </Typography>
              <Typography variant="h4"  sx={{ left: '13.92%', right: '57.19%', top: '83.95%', bottom: '10.88%', textAlign: 'center', color: '#002F9C', fontStyle: 'normal', fontWeight:400, fontSize: '43.8903px', lineHeight: '53px'}}>
              coisas maravilhosas
              </Typography> 
              <Typography variant="h3"  sx={{ left: '13.92%', right: '63.79%', top: '87.13%', bottom: '5.65%', textAlign: 'center', color: '#002F9C', fontStyle: 'normal', fontWeight:400, fontSize: '43.8903px', lineHeight: '53px'}}>
               acontecem 
              </Typography> 
               </div>

 
          </StyledContent>
        )}

     
        <Container>
          <StyledContent>
            <LoginForm />
          </StyledContent>

        </Container>
      </StyledRoot>
    </>
  );
}