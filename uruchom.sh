#!/bin/bash

# ten skrypt uruchamia plik apka.jar, jeśli pojawi się w katalogu
# i restartuje program, gdy plik zostanie zaktualizowany
# To taka symulacja działania prawdziwego serwera aplikacji...

while true
do
    date "+%H:%M:%S"
    if [ apka.jar -nt aktualny ]
    then
      touch aktualny
      echo "restart leci"
      if [ -n "$pid" ]
      then
        echo killuję $pid
        kill $pid
        sleep 4
      fi
      java -jar ap.jar &
      pid=$!
      echo "Spring uruchomiony w tle pod PID $pid"
    fi
    sleep 5
done
