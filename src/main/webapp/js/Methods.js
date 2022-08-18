var $table = $('#table');

function operations() {
    return [
        `<button type='button'
            class='btn btn-warning actionBtn' 
            data-bs-toggle='modal' 
            data-bs-target='#upDateModal'
            onclick="getUpdateData(this)">
            Actualizar
    </button>
    <button 
            type='button' 
            class='btn btn-danger actionBtn'
             data-bs-toggle="modal" 
             data-bs-target="#deleteActivity"
            onclick="delButton(this)">
            Eliminar
    </button>`
    ];
}