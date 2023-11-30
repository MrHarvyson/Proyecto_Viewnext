$(document).ready(() =>  {

    $.ajax({
        url:'http://localhost:9000/vuelos',
        type: 'GET',
        dataType: 'json',
        success: function(res) {
            console.log(res);
            let data = '';
            res.forEach(element => {
                data += `
                <tr>
                    <td>${element.compania}</td>
                    <td class="text-center">${element.fechavuelo}</td>
                    <td class="text-end">${element.precio} €</td>
                    <td class="text-end">${element.plazasdisponibles}</td>
                </tr>
                `
            });

            $('#tbodyc').html(data);
        }
    });

});