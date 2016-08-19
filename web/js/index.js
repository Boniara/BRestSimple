$(function () {
    $("#submitPromoInput").click(function () {
        var promoTest = $("#inputPromo").val();
        $.ajax({
            type: 'GET',
            url: promoTest,
            success: function (data) {
                console.log(data);
                alertify.success("Success");
                $("#responseData div").remove();
                $.each(data, function (index) {
                    var jsonData = data[index];
                    $("#responseData").append("<div>" + jsonData + data + "</div>");
                })
            },
            error: function (jqXHR, textStatus, errorThrown) {
                alertify.warning(textStatus + " " + jqXHR.status + " " + errorThrown);
            }
        });
    });
});