import { useState } from 'react';
import { useNavigate } from 'react-router-dom';
// @mui
import { Link, Stack, IconButton, InputAdornment, TextField, Checkbox, Typography, Card, Divider, Button, Grid, Paper, useMediaQuery } from '@mui/material';
import { LoadingButton } from '@mui/lab';
// components
import Iconify from '../../../components/iconify';
import useResponsive from '../../../hooks/useResponsive';


// ----------------------------------------------------------------------

export default function LoginForm() {
  const navigate = useNavigate();

  const [showPassword, setShowPassword] = useState(false);

  const handleClick = () => {
    navigate('/dashboard', { replace: true });
  };
 
  return (
    <>
    <section/>
  <Grid container justify="right" sx={{position: '[500ms, 200ms]', left: '53.75%', right: '9.17%', top: '27.56%', bottom: '27.56%', boxShadow: '0px 0px 10px 2px rgba(0,0,0,0.25)', justifyContent: 'center', alignItems: 'center',bgcolor: '#EAEAEA'}}>
  <Grid >
  {/*  */}

  <div sx={{ display: 'flex', justifyContent: 'center', alignItems: 'center' }}>
    <Typography variant="h4" noWrap sx={{ textAlign: 'center', fontFamily: 'Inter, sans-serif' }}>
      Acesso ao Sistema<br/>
    </Typography>
  </div>
      <Divider/><br/>
               <TextField
              variant="outlined"
              margin="normal"
              required
              fullWidth
              id="username"
              label="Usuário"
              name="username"
              autoComplete="username"
              autoFocus
              sx={{ bgcolor: '#FFFFFF' }}
            /><br/>
            <TextField name="password" label="Senha"
              type={showPassword ? 'text' : 'password'}
              InputProps={{
                endAdornment: (
                  <InputAdornment position="end">
                    <IconButton onClick={() => setShowPassword(!showPassword)} edge="end">
                      <Iconify icon={showPassword ? 'eva:eye-fill' : 'eva:eye-off-fill'} />
                    </IconButton>
                  </InputAdornment>
                ),
              }}
              sx={{ width: '100%', mx: 'auto', my: 'auto', display: 'flex', justifyContent: 'center', alignItems: 'center', bgcolor: '#FFFFFF' }}/>
        <br/>
        <Button type="submit" fullWidth variant="contained" onClick={handleClick} sx={{ bgcolor: '#666666', color: '#FFFFFF' }}>
        
          Enviar
          
        </Button>
        


           

             <Stack direction="row" alignItems="center" justifyContent="center" sx={{ my: 2, textAlign: 'center' }}>
              <Link variant="subtitle2" underline="hover" sx={{ color: '#4D4D4D' }}>
                Esqueceu a senha? Clique aqui.
                <br />
                Cadastre-se
              </Link>
            </Stack>  
          
      </Grid>
    </Grid>


     {/* <Card sx={{ aspectRatio: '4/4', boxShadow: '0px 0px 10px 2px rgba(0,0,0,0.25)', justifyContent: 'center', alignItems: 'center',bgcolor: '#EAEAEA'}}>
  <Stack spacing={3}>
    <div sx={{display: 'flex', justifyContent: 'center', alignItems: 'center'}}>
      <Typography variant="h3" sx={{ textAlign: 'center'}}>
        <br></br>Acesso ao sistema
      </Typography>
    </div>
    <Divider/>
     <TextField name="email" label="Usuário" sx={{ width: '100%', mx: 'auto', my: 'auto', display: 'flex', justifyContent: 'center', alignItems: 'center'}} InputLabelProps={{ shrink: true }}/>
    
    <TextField name="password" label="Senha"
      type={showPassword ? 'text' : 'password'}
      InputProps={{
        endAdornment: (
          <InputAdornment position="end">
            <IconButton onClick={() => setShowPassword(!showPassword)} edge="end">
              <Iconify icon={showPassword ? 'eva:eye-fill' : 'eva:eye-off-fill'} />
            </IconButton>
          </InputAdornment>
        ),
      }}
      sx={{ width: '100%', mx: 'auto', my: 'auto', display: 'flex', justifyContent: 'center', alignItems: 'center',}}/>

  </Stack>
      
  <Button 
  sx={{
    width: '75%', 
    bgcolor: 'gray', 
    color: '#FFF', 
    fontSize: '1.2rem',
    '&:hover': {
      bgcolor: 'darkgray',
    },
    display: 'flex', 
    justifyContent: 'center',
    alignItems: 'center',
    margin: 'auto', 
    mt: 2
  }}>
  Entrar
</Button>


  <Stack direction="row" alignItems="center" justifyContent="center" sx={{ my: 2, textAlign: 'center' }}>
    <Link variant="subtitle2" underline="hover">
      Esqueceu a senha? Clique aqui. <p />
    <p /> Cadastre-se</Link>
  </Stack>
</Card> */}


<Stack>
  <img src="/assets/illustrations/setadireita.png" alt="setad" />
    </Stack>
    </> 
    
  );

}
