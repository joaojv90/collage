function callProcedure(event, form){
    fetch(form.action,{
        method: "POST",
        body: new FormData(form)
    }).then((response) => {
        if (response.ok) {
            return response.text()
        } else {
            alert("No se ejecutó el procedure");
        }
    }).then((data)=>writeResponse(data))
    event.preventDefault();
}

function writeResponse(response){
    let result = document.getElementById("response")
    result.innerHTML = response
}