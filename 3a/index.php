<html>
    <body>
        <?php
        $name = filter_input(INPUT_POST,'name');
        $dept = filter_input(INPUT_POST,'dept');
        $rollno= filter_input(INPUT_POST,'rno');
        $address= filter_input(INPUT_POST,'adress');
        print "your name is ".$name."</br>" ;
        print "your departement is ".$dept."</br>" ;
        print "your rollnumber is ".$rollno."</br>" ;
        print "your address is ".$address."</br>" ;
        ?>
    </body>
</html>
