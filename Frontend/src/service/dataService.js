const listarTodasAlunas = async () => {
  try{
  const response = await fetch("http://localhost:8080/alunas", 
  //{credentials: 'include'}
  );
  const listaAlunas =  await response.json();
  return listaAlunas;
  } catch(e){
    console.log(e)
  }
}

const listarTodasAssociadas = async () => {
  try{
  const response = await fetch("http://localhost:8080/associadas", 
  //{credentials: 'include'}
  );
  const listaAssociadas =  await response.json();
  return listaAssociadas;
  } catch(e){
    console.log(e)
  }
}
const DataService = {
  listarTodasAlunas,
  listarTodasAssociadas
}
export default DataService