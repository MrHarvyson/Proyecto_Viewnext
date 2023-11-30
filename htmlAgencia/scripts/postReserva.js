document.querySelector('form').addEventListener('submit', function(event) {
    event.preventDefault();
  
    // Crea un objeto vacío para almacenar los datos del formulario
    var data = {};
  
    // Llena el objeto data con los valores del formulario
    new FormData(event.target).forEach((value, key) => {
        if (key === 'idvuelo') {
          // Si la clave es 'idvuelo', obtén el id del option seleccionado
          value = document.querySelector('#idvuelo option:checked').id;
        }
        data[key] = value;
      });
    
      // Convierte el objeto data a una cadena JSON
      var jsonData = JSON.stringify(data);
      console.log(jsonData);
  
    // Usa la API fetch para enviar los datos como una solicitud POST
    fetch('http://localhost:8080/reservas', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json'
      },
      body: jsonData
    });
  });
  
  