<script>
    import axios from "axios";

    // TODO: Setze hier die URL zu deinem mit Postman erstellten Mock Server
    //const api_root = "https://b7d295f0-04dc-4b84-92e1-55ee789cecb3.mock.pstmn.io";
    const api_root = "http://localhost:8080";

    let module = [];
    let modul = {
        name: null,
        price: null,
        etcs: null,
        spezialication: null,
    };

    function getModule() {
        var config = {
            method: "get",
            url: api_root + "/api/modul",
            headers: {},
        };

        axios(config)
            .then(function (response) {
                module = response.data;
            })
            .catch(function (error) {
                alert("Could not get module");
                console.log(error);
            });
    }
    getModule();

    function createModul() {
        var config = {
            method: "post",
            url: api_root + "/api/modul",
            headers: {
                "Content-Type": "application/json",
            },
            data: modul,
        };

        axios(config)
            .then(function (response) {
                alert("Modul created");
                getModule();
            })
            .catch(function (error) {
                alert("Could not create Modul");
                console.log(error);
            });
    }
</script>


<h1 class="mt-3">Create Modul</h1>
<form class="mb-5">
    <div class="row mb-3">
        <div class="col">
            <label class="form-label" for="name">Name</label>
            <input
                bind:value={modul.name}
                class="form-control"
                id="name"
                type="text"
            />
        </div>
    </div>
    <div class="row mb-3">
        <div class="col">
            <label class="form-label" for="price">Price</label>
            <select
                bind:value={modul.price}
                class="form-select"
                id="price"
                type="number"
            >
                <option value="10">10</option>
                <option value="20">20</option>
                <option value="30">30</option>
                <option value="40">40</option>
            </select>
        </div>
        <div class="col">
            <label class="form-label" for="etcs">ETCS</label>
            <input
                bind:value={modul.etcs}
                class="form-control"
                id="etcs"
                type="number"
            />
        </div>
        <div class="col">
            <label class="form-label" for="spezialication">Spezialication</label>
            <input
                bind:value={modul.spezialication}
                class="form-control"
                id="spezialication"
                type="text"
            />
        </div>
    </div>
    <button type="button" class="btn btn-primary" on:click={createModul}>Submit</button>
</form>

<h1>All Module</h1>
<table class="table">
    <thead>
        <tr>
            <th scope="col">Name</th>
            <th scope="col">Price</th>
            <th scope="col">ETCS</th>
            <th scope="col">Spezialication</th>
            <th scope="col">StudentId</th>
            <th scope="col">Comment</th>
        </tr>
    </thead>
    <tbody>
        {#each module as modul}
            <tr>
                <td>{modul.name}</td>
                <td>{modul.price}</td>
                <td>{modul.etcs}</td>
                <td>{modul.spezialication}</td>
                <td>{modul.StudentId}</td>
                <td>{modul.comment}</td>
            </tr>
        {/each}
    </tbody>
</table>
