function carregarArtistas() {
    fetch("http://localhost:8080/artistas")
    .then(res => res.json())
    .then(res => montarCombo(res))
}

function montarCombo(lista) {
    var combo = "";
    for (cont = 0; cont < lista.length; cont++) {
        combo += 
            "<option value='" + lista[cont].id + "'>" + lista[cont].nomeArtistico + "</option>";
    }
    document.getElementById("cmbArtistas").innerHTML = combo;
}