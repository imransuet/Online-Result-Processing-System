<%-- 
    Document   : course
    Created on : 29 Oct, 2015, 5:45:16 PM
    Author     : Tarequzzaman
--%>
<pagination-tag:pager start="<%=1%>" range="<%=5%>" results="<%=3%>"/>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
         .header{
                background-color: #5EFB6E; 
                text-align: center;
                padding: 30px;
            }
            .mainmanu{
                text-align: center;
                align: center;
            }
            .main1{
                    font-size: 17px;
                    font-family: sans-serif;
                    margin-top: 200px;
                    width: 300px;
                    height: 200px;
                    overflow:hidden; 
               
            }
            .main1 ul{
             
               margin: 0;
               padding:0;
                list-style:none;
            }
            .main1 ul li{
                
                float:none;
                border:2px solid #ddd;
            }
            .main1 ul li a{
            
                text-decoration: none;
                color:#000;
                display: block;
                padding: 10px 20px;
            }
            .main1 ul li a:hover{
                background-color: darkorange;
            }
        </style>
    </head>
     <body>
        <div class ="main">
            <div class="header">

                <h1>Welcome to result Processing System</h1>
            </div>
            <div class="mainmanu">
                <center>
                    <h1>Error occur Please enter correct data</h1>
                    </center>

            </div>
            <div class="footer">


            </div>
        </div>

    </body>
</html>
