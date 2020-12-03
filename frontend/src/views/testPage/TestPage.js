import React, { lazy, useState, useEffect, } from 'react'
import axios from 'axios'
import {
  CBadge,
  CButton,
  CButtonGroup,
  CCard,
  CCardBody,
  CCardFooter,
  CCardHeader,
  CCol,
  CProgress,
  CRow,
  CCallout
} from '@coreui/react'

const TestPage = () => {
  const [name, setName] = useState('')
  const [code, setCode] = useState('IN')
  const [countryList, setList] = useState([])

  function handleSubmit() {
    axios.get(`/country/${code}`).then(response => {
      setName(response.data.Name)
    })
  }

  function handleClick() {
    axios.get('/country/').then(response => {
      setList(response.data)
    })
  }

  function displayCountries() {
    const disp = countryList.map((country) => 
      (
        <tr>
          <td>{country.Id}</td>
          <td>{country.Code}</td>
          <td>{country.Name}</td>
        </tr>
      ) 
    )
    return disp;

  }


  return (<div>
            <h1>SpringBoot Backend Testing:</h1>          
            <hr/>
            <br/>
            <h3> Get a Single Country's Data:</h3>
            <br/>
            <form>
              <label onSubmit={handleSubmit()}>
                Enter a Country Code:
                <input type="text" value={code} onChange={(e) => {setCode(e.target.value.toUpperCase())}} />
              </label>
            </form>
            <br/>
            <h5> Your Country's Name is: {name} </h5>
            <hr/>
            <h3> Get All Country Data:</h3>
            <CButton onClick={handleClick}> Click here!</CButton>

            <table>
              <thead>
                <tr>
                  <th>ID</th>
                  <th>Code</th>
                  <th>Name</th>
                </tr>
              </thead>
              <tbody>
                {displayCountries()}
              </tbody>
            </table>
          </div>)

}

export default TestPage;
