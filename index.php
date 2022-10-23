<?php  
function ucgen($sayi){
    $i=1;
    if ($i == 1){
        echo "0"."<br>";
        $i++;
    }
    while ($i <= $sayi){
        echo "0";
        
        for ($j=2;$j <= $i;$j++){
            echo "0";
            if ($j == $i){
                echo "<br>";
            }
        }
        $i++;
    }
}
echo ucgen(15);
?>