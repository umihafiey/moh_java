<%! int day = 7; %>
<html>
    <head>
        <title>IF---ELSE Eample</title>
    </head>
    <body>
        <% if (day==1 | day==7) { %>
            <p>Today is weekend </p>
        <% } else { %>
            <p>Today is not weekend </p>
        <% } %>
        
        <hr>
        <h1>SWITCH...CASE Example</h1>
        <% 
        switch(day) {
            case 0:
                out.println("It\'s Sunday.");
                break;
            case 1:
                out.println("It\'s Monday.");
                break;
            case 2:
                out.println("It\'s Tuesday.");
                break;
            case 3:
                out.println("It\'s Wednesday.");
                break;
            case 4:
                out.println("It\'s Thursday.");
                break;
            case 5:
                out.println("It\'s Friday.");
                break;
            default:
                out.println("It\'s Saturday.");
                break;
        }
        %>
    </body>
</html>
