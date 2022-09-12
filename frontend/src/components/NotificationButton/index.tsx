import axios from 'axios';
import icon from '../../assets/img/notifi.svg'
import { BASE_URL } from '../../utils/request';


import './styles.css'

type props = {
  saleId: number;
}
function handleClick(id: number) {
  axios(`${BASE_URL}/sales/${id}/notification`)
.then(reponse =>{

  console.log("SUCESSO")
}
  
  )
}

function NotificationButton({ saleId }: props) {

  return (
    <div className="dsmeta-red-btn" onClick={() => handleClick(saleId)}>
      <img src={icon} alt="Notificar" />
    </div>
  )
}

export default NotificationButton