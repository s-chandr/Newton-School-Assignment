var month =  + window.prompt("Enter the Number of Month\n(Eg: 01 - January ...)");

const MonthList = ["January", "February", "March","April","May","June","July","August","September","October","November","December"];

//document.write(monthList.i);

    if(month===2)
{
    document.write(` Hey ${MonthList[month-1]} has 28 days in a non leap year `);
}
else if(month<=7){
    if(month%2===0)
        document.write(`Hey ${MonthList[month-1]} has 30 days in a year `);
    else    
        document.write(`Hey ${MonthList[month-1]} has 31 days in a year `);
}
else if (month<=12 ){
    if(month%2===0)
        document.write(` Hey ${MonthList[month-1]} has 31 days in a year `);
    else    
        document.write(` Hey ${MonthList[month-1]} has 30 days in a year `);
}
else{
    document.write("Oop's Enter a month number between 0-12");    a
}

