import React from 'react'

function Banner() {
  return (
    <div>
        <div  className='h-[30vh] md:h-[80vh] bg-cover bg-center flex items-end' style={{backgroundImage :'url(https://i.pinimg.com/originals/29/7d/e0/297de0761b0c756266d74ca50d03cc1d.jpg)'}}> </div>
        <div className='text-blue w-full h-full text-center text-2xl font-bold'> Avenger Endgame</div>
    </div>
  )
}

export default Banner
