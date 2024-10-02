import React from 'react'
import RohanLogo from './../assets/RohanRokkamLogo.png'

function FooterComponent() {
  return (
    <div className='footer'>
        <span>All rights reserved by Rohan Rokkam</span>
        <img id='rohan-logo' src={RohanLogo} alt="Logo" />
    </div>
  )
}

export default FooterComponent