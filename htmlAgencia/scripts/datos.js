// mediante envio de string por url
window.onload = function() {
    var params = new URLSearchParams(window.location.search);
    var hotel = JSON.parse(decodeURIComponent(params.get('hotel')));

    console.log(hotel);
    document.getElementById('nombre').textContent = hotel.nombre;
    document.getElementById('nombreHotel').textContent = hotel.nombre;
    document.getElementById('nombreHotel2').value = hotel.idhotel;
    document.getElementById('url').src = hotel.url;
    document.getElementById('descripcion').textContent = hotel.descripcion;
    document.getElementById('precio').textContent = hotel.precio + '€';
}

