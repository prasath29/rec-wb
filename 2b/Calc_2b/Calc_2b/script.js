function numpress(val)
{
    document.getElementById("expr").value += val;
}

function clearscreen()
{
    document.getElementById("expr").value = "";
}

function calculate()
{
    var res = eval(document.getElementById("expr").value);
    document.getElementById("expr").value = res;
}
