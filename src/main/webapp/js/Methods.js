var $table = $('#table');
let idtoDel = 0;

function operations() {
    return [
        `<button type='button'
            class='btn btn-warning actionBtn' 
            data-bs-toggle='modal' 
            data-bs-target='#upDate'
            onclick="getUpdateData(this)">
            Actualizar
    </button>
    <button 
            type='button' 
            class='btn btn-danger actionBtn'
             data-bs-toggle="modal" 
             data-bs-target="#delete"
            onclick="delButton(this)">
            Eliminar
    </button>`
    ];
}

function doPost(event, form) {
    fetch(form.action, {
        method: "POST",
        body: new FormData(form)
    }).then((response) => {
        if (response.ok) {
            alert("Ingreso exitoso");
            $("#table").bootstrapTable("refresh");
        } else {
            alert("No se realizó ningún ingreso");
        }
    });
    event.preventDefault();
    document.getElementById('closeInsert').click();
}

function doPut(event, form) {
    fetch(form.action, {
        method: "PUT",
        body: new FormData(form)
    }).then((response) => {
        if (response.ok) {
            alert("Registro actualizado");
            $("#table").bootstrapTable("refresh");
        } else {
            alert("No se actualizó ninguna registro");
        }
    });
    event.preventDefault();
    document.getElementById('CloseUp').click();
}

function doDelete(id) {
    fetch(`./students?nui=${id}`, {
        method: "DELETE"
    }).then((response) => {
        if (response.ok) {
            alert("Registro Eliminada");
            $("#table").bootstrapTable("refresh");
        } else {
            alert("registro no eliminada");
        }
    });
    document.getElementById('closeDelete').click();
}

function doDeleteT(id) {
    fetch(`./teachers?nui=${id}`, {
        method: "DELETE"
    }).then((response) => {
        if (response.ok) {
            alert("Registro Eliminada");
            $("#table").bootstrapTable("refresh");
        } else {
            alert("registro no eliminada");
        }
    });
    document.getElementById('closeDelete').click();
}

function doDeleteC(id) {
    fetch(`./careers?idCareers=${id}`, {
        method: "DELETE"
    }).then((response) => {
        if (response.ok) {
            alert("Registro Eliminada");
            $("#table").bootstrapTable("refresh");
        } else {
            alert("registro no eliminada");
        }
    });
    document.getElementById('closeDelete').click();
}

function doDeleteS(id) {
    fetch(`./subjects?idSubjects=${id}`, {
        method: "DELETE"
    }).then((response) => {
        if (response.ok) {
            alert("Registro Eliminada");
            $("#table").bootstrapTable("refresh");
        } else {
            alert("registro no eliminada");
        }
    });
    document.getElementById('closeDelete').click();
}

function delButton(e) {
    idtoDel = e.parentElement.parentElement.querySelector("td").innerHTML;
}

const getUpdateData = (e) => {
  let updateData = e.parentElement.parentElement.getElementsByTagName("td");
  let uForm = document
    .getElementById("upDate")
    .getElementsByClassName("form-control");
  for (let i = 0; i < updateData.length - 1; i++) {
    uForm[i].value = updateData[i].innerHTML;
  }  
}

function doPut(event, form) {
    fetch(form.action, {
        method: "PUT",
        body: new FormData(form)
    }).then((response) => {
        if (response.ok) {
            alert("Registro actualizado");
            $("#table").bootstrapTable("refresh");
        } else {
            alert("No se actualizó ningún registro");
        }
    });
    event.preventDefault();
    document.getElementById('CloseUp').click();
}