import { BrowserRouter, Routes, Route } from 'react-router-dom';
import Login from './Login'
import './login.css'
import Cadastro from './Cadastro'
import './cadastro.css'


function App() {
  
  return (
    <>
    <BrowserRouter>
      <Routes>
        <Route path='/login' element={<Login />} />
        <Route path='/cadastro' element={<Cadastro />} />
      </Routes>
    </BrowserRouter>
    
    </>
  )
}

export default App
