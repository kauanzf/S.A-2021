let path_selected
let id_selected


const showModalDeletar = function(path,id){
    path_selected = path
    id_selected = id
	$('#modalDeletar').modal('show')

}

const deletar = function(){
    if(path_selected != "" && id_selected != ""){
        window.location.href='/' + path_selected + '/delete/' + id_selected

    }

}
x = 0
function scrollR(){
    
    document.getElementById("divCard").scrollBy({
        left:390,
        behavior:"smooth"
    })
}

function scrollL(){
    
    document.getElementById("divCard").scrollBy({
        left:-390,
        behavior:"smooth"
    })
}

function predio(){
    //window.scrollBy(0,-500)
    document.getElementById("divCard").scrollTo({
        left:0,
        behavior:"smooth"
    })
    document.getElementById("predio").classList.add("view")
    setTimeout(function(){
        document.getElementById("predio").classList.remove("view")
    }, 2000)

    //window.scrollBy(0,-500)
}


function jardim(){
    document.getElementById("divCard").scrollTo({
        left:0,
        behavior:"smooth"
    })
    document.getElementById("jardim").classList.add("view")
    setTimeout(function(){
        document.getElementById("jardim").classList.remove("view")
    }, 2000)
}

function monumento(){
    document.getElementById("divCard").scrollTo({
        left:410,
        behavior:"smooth"
    })
    document.getElementById("monumento").classList.add("view")
    setTimeout(function(){
        document.getElementById("monumento").classList.remove("view")
    }, 2000)
}


/*
var now = new Date();
function date(){
document.getElementById("date").innerHTML = now.getDate()+"/"+now.getMonth()+"/"+now.getFullYear()
}
*/
