import SvgColor from '../../../components/svg-color';

const icon = (name) => <SvgColor src={`/assets/icons/navbar/${name}.svg`} sx={{ width: 1, height: 1 }} />;

const navConfig = [
  {
    title: 'dashboard alunas',
    path: '/dashboard/alunas',
    icon: icon('ic_analytics'),
  },
  {
    title: 'dashboard associadas',
    path: '/dashboard/associadas',
    icon: icon('ic_analytics'),
  }
];

export default navConfig;
