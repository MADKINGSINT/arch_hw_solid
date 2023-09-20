package ModelElements;

import java.io.IOException;
import java.util.List;

public class Scene {

    public Integer id;
    public List<PolygonalModel> models;
    public List<Flash> flashes;
    public List<Camera> cameras;

    public Scene(Integer id, List<PolygonalModel> models, List<Flash> flashes, List<Camera> cameras) throws IOException {

        this.id = id;

        if (models.isEmpty()) {
            throw new IOException("Добавьте модель");
        } else {
            this.models = models;
        }

        this.flashes = flashes;

        if (cameras.isEmpty()) {
            throw new IOException("Добавьте камеру");
        } else {
            this.cameras = cameras;
        }
    }

    public <Type> Type method1(Type typeValue){
        Type result = null;
        return result;
    }

    public <Type> Type method2(Type typeValue1, Type typeValue2){
        Type result = null;
        return result;
    }

}
