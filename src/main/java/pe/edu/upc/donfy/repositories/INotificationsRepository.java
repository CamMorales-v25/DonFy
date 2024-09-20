package pe.edu.upc.donfy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.donfy.entities.Notifications;

import java.util.List;

@Repository
public interface INotificationsRepository extends JpaRepository<Notifications, Integer> {

    @Query("SELECT n.idNotificacion, n.mensaje, n.estado, n.tipoNotificacion, u " +
                    "FROM Notifications n " +
                    "JOIN n.usuarios u " +
                    "WHERE u.id = :userId")
    List<Notifications> findNotificationsByUserId(@Param("userId") Long userId);

}
