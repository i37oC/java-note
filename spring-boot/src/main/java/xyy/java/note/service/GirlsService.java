package xyy.java.note.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyy.java.note.domain.Girl;
import xyy.java.note.enums.ResultEnums;
import xyy.java.note.exception.GirlException;
import xyy.java.note.repository.GrilRepository;

/**
 * @author xyy
 * @version 1.0 2017/5/14.
 * @since 1.0
 */
@Service
public class GirlsService {
    @Autowired
    private GrilRepository grilRepository;

    public void getAge(Integer id) throws Exception {
        Girl girl = grilRepository.findOne(id);
        Integer age = girl.getAge();
        if(age<=10){
            throw new GirlException(ResultEnums.LITTLE_SCHOLE);
        }else if(age<=16){
            throw new GirlException(ResultEnums.MIDDLE_SCHOLE);
        }
    }
}
