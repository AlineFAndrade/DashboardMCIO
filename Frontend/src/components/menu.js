import { Breadcrumbs, Link } from '@mui/material';

export function Menu() {
  return (
    <div>
      <Breadcrumbs aria-label="breadcrumb">
        <Link color="inherit" href="/alunas" > Alunas </Link>
        <Link color="inherit" href="/associadas"> Associadas </Link>
        <Link color="inherit" href="/upload"> Upload </Link>
        <Link color="inherit" href="/logout"> Logout </Link>
      </Breadcrumbs>
    </div>
  )
}