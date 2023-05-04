import { Helmet } from 'react-helmet-async';
import { styled } from '@mui/material/styles';
import { Box, Container, ImageListItem, Typography } from '@mui/material';
import useResponsive from '../hooks/useResponsive';
import { LoginForm } from '../sections/auth/login';

const StyledRoot = styled('div')(({ theme }) => ({
  [theme.breakpoints.up('md')]: {
    display: 'flex',
  },
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
            <StyledContent style={{ position: 'absolute', left: '3.95%', right: '69.79%', background: 'linear-gradient( 180.43deg, #FFFFFF -8.72%, #CCCCCC 122.19%)', boxShadow: '0px 0px 10px 2px rgba(0,0,0,0.25)' }} >

              <Box sx={{ alignItems: 'center' }}>
                <ImageListItem sx={{ width: '0.8', marginInline: '2rem' }}>
                  <img src="/assets/illustrations/telamcio.png" alt="login" />
                </ImageListItem>
                <Typography noWrap sx={{ fontSize: '1.8rem', textAlign: 'center', fontFamily: 'Inter, sans-serif', color: 'red' }}>
                  Mulheres na Tecnologia
                </Typography>
              </Box>
              <ImageListItem sx={{paddingX: '1', paddingY: '2rem'}}>
                <img src="/assets/illustrations/seta.png" alt="seta" />
              </ImageListItem>

              <Box sx={{ alignSelf: 'center' }}>
                <Typography variant='h3' sx={{ fontFamily: 'Inter, sans-serif', fontWeight: 400, fontSize: '1.6rem', lineHeight: 0.9, color: '#002F9C', }}>
                  Quando mulheres
                </Typography>
                <Typography sx={{ fontFamily: 'Inter, sans-serif', fontSize: '1.8rem', lineHeight: 0.9, color: '#002F9C', }}>
                  se unem
                </Typography>
                <Typography variant='h3' sx={{ fontFamily: 'Inter, sans-serif', fontWeight: 400, fontSize: '1.6rem', lineHeight: 0.9, color: '#002F9C', }}>
                  coisas maravilhosas
                </Typography>
                <Typography sx={{ fontFamily: 'Inter, sans-serif', fontWeight: 400, fontSize: '1.8rem', lineHeight: 0.9, color: '#002F9C', }}>
                  acontecem
                </Typography>
              </Box>
            </StyledContent>
          )
        }

        <Container>
          <StyledContent style={{ marginLeft: '30rem' }}>
            <LoginForm />
          </StyledContent>
        </Container>
      </StyledRoot>
    </>
  );
}