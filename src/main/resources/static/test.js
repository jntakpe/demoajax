(function () {
    'use strict';
    setInterval(function () {
        $.ajax('api/location').done(function (data) {
            console.log(data);
            //ici j'appele gmapapi.refresh(data)
            $('h1').text("latitude " + data.latitude);
        });
    }, 4000)
})();
