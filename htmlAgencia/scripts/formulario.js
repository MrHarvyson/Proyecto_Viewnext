$(document).ready(function(){
    $("#miFormulario").on('submit', function(e) {
      e.preventDefault();
  
      var nombre = $("#nombre").val();
  
      $.ajax({
        url: 'http://localhost:8000/hoteles/'+nombre,
        type: 'GET',
        dataType: 'json',
        contentType: 'application/json',
        success: function(res) {
            console.log(res);
            var element = res;
            var data = `
              <tr>
                  <td>${element.idhotel}</td>
                  <td>${element.nombre}</td>
                  <td>${element.precio}</td>
                  <td>${element.disponible}</td>
                  <td>${element.categoria}</td>
              </tr>
              `;
            $('#tbody').html(data);
          }
      });
    });
  });
  