$(document).ready(function () {

    // Обработчик нажатия на кнопку "Увеличить счетчик"
    $('#btnUpCount').click(function () {

        //console.log($('#inputMaxValue').val());

        var maxValue = $('#inputMaxValue').val();

        $.ajax({
            type: "POST",
            data: {param: maxValue},
            url: '/increment',
            success: function (data) {
                $("#count").html(data);
            }
        });
    });


    $('#setMaxValue').click(function () {

        var maxValue = $('#inputMaxValue').val();

        $.ajax({
            type: "POST",
            data: {param: maxValue},
            url: '/setMaxValue',
            success: function (data) {
                if (data == "error") {
                    $("#inputMaxValue").css('border-color', 'red');
                    $('#inputMaxValue').attr('placeholder','Пусто или буквы или 0 или слишком много цифр');
                }
                if (data == "success"){
                    $("#inputMaxValue").css('border-color', 'gray');
                    $('#inputMaxValue').attr('placeholder','Ввести MAX int');
                }
            }
        });
    });

});