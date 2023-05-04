import { useState } from 'react';
import { useNavigate } from 'react-router-dom';
import { Link, Stack, IconButton, InputAdornment, TextField, Typography, Divider, Button, Grid, Box } from '@mui/material';
import Iconify from '../../../components/iconify';

export default function LoginForm() {
  const navigate = useNavigate();

  const [showPassword, setShowPassword] = useState(false);

  const handleClick = () => {
    navigate('/dashboard', { replace: true });
  };

  return (
    <>
      <Grid container sx={{ boxShadow: '0px 0px 10px 2px rgba(0,0,0,0.25)', justifyContent: 'center', bgcolor: '#EAEAEA' }}>
        <Grid >
          <Box sx={{ display: 'flex', justifyContent: 'center', alignItems: 'center' }}>
            <Typography variant="h4" noWrap sx={{ textAlign: 'center', fontFamily: 'Inter, sans-serif', padding: '2rem' }}>
              Acesso ao Sistema
            </Typography>
          </Box>
          <Divider /><br />
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
          /><br />
          <TextField
            name="password"
            label="Senha"
            variant="outlined"
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
            sx={{ width: '100%', bgcolor: '#FFFFFF' }} />
          <br />
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

      <Stack>
        <img src="/assets/illustrations/setadireita.png" alt="setad" />
      </Stack>
    </>

  );

}
