
import Home from "./pages/Home.svelte";
import Students from "./pages/Student.svelte";
import Module from "./pages/Modul.svelte";

export default {
    '/': Home,
    '/home': Home,
    '/student': Students,

    '/modul': Module,
}