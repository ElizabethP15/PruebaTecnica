function eliminar(id) {
	swal({
		title: "Estas seguro de eliminar?",
		text: "Una vez eliminado, los datos no se recuperan!",
		icon: "warning",
		buttons: true,
		dangerMode: true,
	})
		.then((OK) => {
			if (OK) {
				$.ajax({
					url:"/eliminar/"+id,
					success: function(res) {
						console.log(res);
					}
				});
				swal("Poof! El registro ha sido eliminado!", {
					icon: "success",
				}).then((ok)=>{
					if(ok){
						location.href="/listar";
					}
				});
			} else {
				swal("El registro esta a salvo!");
			}
	});
}