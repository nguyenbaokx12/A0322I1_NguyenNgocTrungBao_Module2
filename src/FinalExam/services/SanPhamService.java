package FinalExam.services;

import FinalExam.exception.NotFoundProductException;
import FinalExam.models.SanPham;
import FinalExam.util.FileHelper;


import java.util.ArrayList;
import java.util.List;

public class SanPhamService {
    private List<SanPham> sanPhams = new ArrayList<>();
    private static final String PATH = "src/FinalExam/data/trungbao.csv";
    private FileHelper fileHelper = new FileHelper();

    public void addSanPham(SanPham sanPham){
        int lastID = 0;
        if (sanPhams.size() >0){
            lastID = sanPhams.get(sanPhams.size() - 1).getiDSanPham();
        }
        sanPham.setiDSanPham(lastID + 1);
        sanPhams.add(sanPham);
        fileHelper.writer(PATH,sanPhams,false);
    }
    public void delete(int id) throws NotFoundProductException {
        for (int i = 0;i<sanPhams.size();i++){
            if (sanPhams.get(i).getiDSanPham() == id){
                sanPhams.remove(i);
                fileHelper.writer(PATH,sanPhams,false);
                return;
            }
        }
        throw new NotFoundProductException(id + "Sản phẩm không tồn tại");
    }


    public List<SanPham> findAll(){
        return sanPhams;
    }




}
