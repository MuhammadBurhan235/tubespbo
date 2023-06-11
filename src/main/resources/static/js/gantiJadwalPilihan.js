$(document).ready(function() {
    // Mengisi input email jika ada di session storage
    var email = sessionStorage.getItem('email');
    if (email) {
        $("#emailInput").val(email);
    }

    $("#submitButton").click(function() {
        var email = $("#emailInput").val();
        
        var selectedRow = $("input[name='pilihanPasien']:checked").closest("tr");
        var department = selectedRow.attr("data-department");
        var tanggalKerja = selectedRow.find("td:nth-child(2)").text();
        var namaDokter = selectedRow.find("td:nth-child(3)").text();
        var jamKerja = selectedRow.find("td:nth-child(4) span").text();

        var jadwalPilihanPasien = {
            emailPasien: email,
            department: department,
            tanggalKerja: tanggalKerja,
            namaDokter: namaDokter,
            jamKerja: jamKerja
        };

        $.ajax({
            type: "POST",
            url: "/ganti-pilihan-pasien",
            data: JSON.stringify(jadwalPilihanPasien),
            contentType: "application/json",
            success: function(response) {
                console.log("Data pilihan pasien berhasil diubah");
            },
            error: function(xhr, status, error) {
                console.log("Terjadi kesalahan saat mengubah data pilihan pasien: " + error);
            }
        });
    });
});
