package com.app.babybaby.repository.alert.alertFollow;

import com.app.babybaby.domain.alertDTO.AlertFollowDTO;
import com.app.babybaby.entity.alert.Alert;
import com.app.babybaby.entity.alert.alertFollow.AlertFollow;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface AlertFollowQueryDsl {
    public List<AlertFollow> getNoReadAlertList();
    public Page<AlertFollow> findAllByUserId(Pageable pageable, Long userId);

}
