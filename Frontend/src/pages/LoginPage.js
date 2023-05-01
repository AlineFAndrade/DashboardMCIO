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
          <StyledContent >
 
            <img src="/assets/illustrations/telamcio.png" alt="login" />
            <div sx={{display: 'flex', justifyContent: 'center', alignItems: 'center'}}>
            <Typography variant="h3" sx={{ textAlign: 'center', color: 'red', text:'bold'}}>
              <p> Mulheres na Tecnologia </p>
            </Typography> </div>

            <img src="/assets/illustrations/seta.png" alt="seta" />

            <div sx={{display: 'flex', justifyContent: 'center', alignItems: 'center'}}>
            <Typography variant="h4" sx={{ color: '#002F9C', text: 'bold', textAlign: 'center' }}>
              Quando mulheres <i>se unem </i> <p></p>
              coisas maravilhosas <i>acontecem!</i><p></p>
            </Typography> </div> 

 
          </StyledContent>
        )}

     
        <Container>
          <StyledContent>
            <LoginForm />
          </StyledContent>

        </Container>
        <StyledSection>
        <img src="/assets/illustrations/lateral.png" alt="seta" />


        </StyledSection>
      </StyledRoot>
    </>
  );
}


// export default function LoginPage() {
//   const mdUp = useResponsive('up', 'md');

//   return (
//     <>
//       <Helmet>
//         <title> Login | MCIO </title>
//       </Helmet>

//       <StyledRoot>
   

      
//         {mdUp && (
//           <StyledSection>           
//             <img src="/assets/illustrations/telamcio.png" alt="login" />
//           </StyledSection>
//         )}
//    <div sx={{display: 'flex', justifyContent: 'center', alignItems: 'center'}}>
//       <Typography variant="h3" sx={{ textAlign: 'center', color: 'red', text:'bold'}}>
//       Mulheres na Tecnologia
//       </Typography> </div>
           
//        <img src="/public/favicon/seta.png" alt="seta" />


//         <div sx={{display: 'flex', justifyContent: 'center', alignItems: 'center'}}>
//       <Typography variant="h4" sx={{ textAlign: 'center', color: 'blue', text:'bold'}}>
//       <p> Quando mulheres </p>
//       <i><p> se unem </p></i>
//       <p> coisas maravilhosas</p>
//       <i><p> acontecem </p></i>
//       </Typography> </div>


//         <Container maxWidth="sm">
//           <StyledContent>

//             <LoginForm />
//           </StyledContent>
//         </Container>
//       </StyledRoot>
//     </>
//   );
// }
