/*
function App() {
  return <main>
    <head>
      <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
        integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
        crossorigin="anonymous" />
    </head>
    <body>
      <div class="container">
        <br />
        <div class="d-grid gap-2 col-4 mx-auto">
          <br />
          <form class="form-signin w-100 m-auto">
            <a class="w-100 btn btn-lg btn-primary" href="http://localhost:3000/oauth2/authorization/keycloak"
              role="link" style={{ marginTop: '10px' }}>
              Login
            </a>
          </form>
        </div>
      </div>
    </body>
  </main>
}

export default App;
*/

import React from 'react';
import './App.css';  // Importando o arquivo CSS

function App() {
  return (
    <>
      <head>
        <link
          rel="stylesheet"
          href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
          integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
          crossOrigin="anonymous"
        />
      </head>

      
      <body>

      
      <div className="container">
        <div 
          className="card shadow-lg p-4 text-center"
          style={{
            borderRadius: '10px',
            backgroundColor: '#e2e8f0',
            width: '100%',
            maxWidth: '500px',
            boxSizing: 'border-box',
          }}
        >
          <h1
            style={{
              color: '#5a67d8',
              fontWeight: 'bold',
              marginBottom: '20px',
              fontSize: '1.5rem',
            }}
          >
            Resource Details Access
          </h1>
          <div className="d-flex justify-content-center">
          <a
            className="w-50 btn btn-lg btn-primary"
            href="http://localhost:3000/oauth2/authorization/keycloak"
            role="link"
          >
            Login
          </a>
          </div>
        </div>
      </div>
      </body>
    </>
  );
}

export default App;
