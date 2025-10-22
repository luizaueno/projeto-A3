import './cadastro.css';

export default function Cadastro() {
    return (
        <>
        <div className="container">
            <h2>Cadastre-se</h2>
            <input className="input" type="text" placeholder="Nome" required/>
            <input className="input" type="text" placeholder="Telefone com DDD" required />
            <input className="input" type="email" placeholder="Email" required/> 
            <input className="input" type="password" placeholder="Senha" required />
            <input className="input" type="password" placeholder="Confirme sua Senha" required />
            <button id="botao" type='submit'>Cadastrar</button>

        </div>
        </>
    )
    
}