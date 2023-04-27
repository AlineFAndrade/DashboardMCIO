const listAllStudents = async () => {
  try{
  const response = await fetch('http://localhost:8080/alunas', 
  //{credentials: 'include'}
  );
  const listaAlunas =  await response.json();
  return listaAlunas;
  } catch(e){
    console.log(e)
  }
}

const listAllAssociated = async () => {
  try{
  const response = await fetch('http://localhost:8080/associadas', 
  //{credentials: 'include'}
  );
  const listaAssociadas =  await response.json();
  return listaAssociadas;
  } catch(e){
    console.log(e)
  }
}

/*
https://muffinman.io/blog/uploading-files-using-fetch-multipart-form-data/
Tirei a ideia daqui 👆
*/
const uploadFile = async (file) => {
  const formData = new FormData();
  formData.append('file', file);
  fetch('http://localhost:8080/associadas', {
    method: 'POST',
    body: formData
  })

}
const DataService = {
  listAllStudents,
  listAllAssociated,
  uploadFile
}
export default DataService