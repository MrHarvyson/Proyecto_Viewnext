$(document).ready(() => {

  // Función para mostrar las card de los hoteles
  function mostrarHoteles(hoteles) {
    var container = $('#hoteles');
    container.empty(); // Limpiar el contenedor
    hoteles.forEach(function (hotel) {
      var hotelString = encodeURIComponent(JSON.stringify(hotel));
      var card = `
      <div class="col d-flex align-items-stretch">
      <div class="card" style="width: 100%;">
          <img src="${hotel.url}" class="card-img-top img-fluid" style="object-fit: cover; height: 15rem;" alt="...">
          <div class="card-body d-flex flex-column">
              <h5 class="card-title">${hotel.nombre}</h5>
              <p class="card-text">${hotel.descripcion}</p>
              <p class="card-text">Desde <strong>${hotel.precio}€</strong></p>
              <a href="paginas/hotel.html?hotel=${hotelString}" class="btn btn-primary mt-auto">Reservar</a>
          </div>
      </div>
  </div>
  
      `;
      container.append(card);
    });
  }

  // Cargar todos los hoteles al inicio
  $.ajax({
    url: 'http://localhost:8000/hoteles/disponibles', // URL del endpoint
    method: 'GET',
    dataType: 'json',
    success: function (response) {
      mostrarHoteles(response);
    }
  });

  // Controlador de eventos para el formulario
  $('#formulario').on('submit', function (e) {
    e.preventDefault(); 
    var nombreHotel = $('#nombreHotel').val(); // Obtener el nombre del hotel del campo de entrada del formulario
    $.ajax({
      url: 'http://localhost:8000/hoteles/' + nombreHotel, // URL del endpoint
      method: 'GET',
      dataType: 'json',
      success: function (response) {
        mostrarHoteles([response]); // Mostrar solo el hotel específico
      }
    });

    $('html, body').animate({
      scrollTop: $("#hoteles").offset().top
    }, 0);
  });

});

