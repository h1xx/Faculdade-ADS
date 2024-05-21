(function() {

  $.ajax({
    beforeSend: function(request){
      request.setRequestHeader("X-Api-Key", "OleMI6jD+oMBurVFXBt9kQ==qVLiJS1hk3HCkkxc")
    },
    type: "GET", 
    dataType: "json",
    url:"https://api.api-ninjas.com/v1/airports?min_elevation=1",
    success: function(dataNinja){

      console.log(dataNinja);

      $("#myTable").DataTable({
        data: dataNinja,
        columns:[
          {'data' : 'icao'},
          {'data' : 'name'},
          {'data' : 'city'},
          {'data' : 'country'},
          {'data' : 'elevation_ft'},
          {'data' : 'latitude'},
          {'data' : 'longitude'},
          {'data' : 'timezone'},

        ]
          
        

      });
    }
});
})();