import { useState } from 'react';
import { useNavigate } from 'react-router-dom';
// @mui
import { Link, Stack, IconButton, InputAdornment, TextField, Checkbox, Typography, Box, Card } from '@mui/material';
import { LoadingButton } from '@mui/lab';
// components
import Iconify from '../../../components/iconify';


// ----------------------------------------------------------------------

export default function LoginForm() {
  const navigate = useNavigate();

  const [showPassword, setShowPassword] = useState(false);

  const handleClick = () => {
    navigate('/dashboard', { replace: true });
  };
 
  return (
    <>

<Card sx={{ aspectRatio: '5/5', boxShadow: '0px 0px 10px 2px rgba(0,0,0,0.25)', justifyContent: 'center', alignItems: 'center'}}> 
      <Stack spacing={3}>
      <div sx={{justifyContent: 'center', alignItems: 'center'}}>
      <Typography variant="h3" sx={{ textAlign: 'center', color: '#002F9C'}}>
             <p><p> Acesso ao sistema</p></p>
      </Typography> </div>

        <TextField name="email" label="Email" />


        <TextField
          name="password"
          label="Senha"
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
        />
      </Stack>

      <Stack direction="row" alignItems="center" justifyContent="space-between" sx={{ my: 2 }}>
        {/* <Checkbox name="remember" label="Remember me" type= "Salvar senha"/> */}
        <Link variant="subtitle2" underline="hover">
          Esqueceu a senha?
        </Link>
      </Stack>

      <LoadingButton fullWidth size="large" type="submit" variant="contained" onClick={handleClick} color= "secondary" main= '#002F9C'
      contrastText= '#002F9C'>
        Entrar
      </LoadingButton>
      </Card>
    </>
  );
}
