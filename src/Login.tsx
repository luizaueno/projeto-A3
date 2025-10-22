import './login.css';
import { Link } from 'react-router-dom';

export default function Login() {
  return(
    <>
    <div className="container">
      <h1>Bem vindo!</h1>
      <input className="input" type="email" placeholder="Email" required/> 
      <input className="input" type="password" placeholder="Senha" required />
      <button id="botao" type='submit'>Entrar</button>
      <Link to="/cadastro" className='cadastro-link'>Cadastre-se aqui</Link>
    </div>
    </>
   
  )
} 