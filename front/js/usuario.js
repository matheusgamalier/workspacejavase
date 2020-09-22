function carregarUsuario() {
    var usuario = localStorage.getItem("userLogado");
    
    if (usuario == null) {
        location = "index.html";
    } else {
        var usuarioJson = JSON.parse(usuario);
        document.getElementById("foto").innerHTML = 
        "<img alt='foto do usuario' title='" + usuarioJson.nome + "' src='img/" + usuarioJson.foto + "'/>";

        document.getElementById("dados").innerHTML = 
        "<h3>" +
            "Nome: " + usuarioJson.nome +
            "<br>Email: " + usuarioJson.email + 
        "</h3>";
    }
}

function tabelaFiltroLancamento(lista) {
    var tabela = 
    "<table class='table'>" +
        "<tr>" + 
            "<th>Musica</th>" + 
            "<th>Dt. Cadastro</th>" +
            "<th>Nome Artista</th>" + 
        "</tr>"; 
    
    for(cont = 0; cont < lista.length; cont++) {
        tabela += 
            "<tr>" + 
                "<td>" + lista[cont].titulo + "</td>" + 
                "<td>" + lista[cont].cadastro + "</td>" + 
                "<td>" + lista[cont].artista.nomeArtistico + "</td>" + 
            "<tr>";
    }

    tabela += "</table>";
    document.getElementById("filtroLancamento").innerHTML = tabela;
}

function filtrarLancamento() {
    var valor = document.getElementById("cmbLancamento").value;
    var rota = "http://localhost:8080/musicas/"
    
    if (valor == 0 || valor == 1) {
        rota = "http://localhost:8080/musicas/lancamentos/" + valor
    }

    fetch(rota)
        .then(res => res.json())
        .then(res => tabelaFiltroLancamento(res))
        .catch(err => {
            alert("Não encontrado")
    });

}