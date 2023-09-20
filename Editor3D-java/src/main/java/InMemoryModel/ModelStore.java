package InMemoryModel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PolygonalModel;
import ModelElements.Scene;


public class ModelStore implements IModelChanger {

    public ModelStore(IModelChangedObserver[] changeObservers) throws IOException {
        this.changeObservers = changeObservers;

        this.models = new ArrayList<>();
        this.scenes = new ArrayList<>();
        this.flashes = new ArrayList<>();
        this.cameras = new ArrayList<>();

        models.add(new PolygonalModel(null));
        scenes.add(new Scene(1, models, flashes, cameras));
        flashes.add(new Flash());
        cameras.add(new Camera());
    }

    public List<PolygonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private IModelChangedObserver[] changeObservers;


    // Регистрирует изменения модели
    @Override
    public void notifyChange(IModelChanger sender) {
    }

    // Возвращает сцену по id
    public Scene getScene(Integer id) {
        for (Scene scene : scenes) {
            if (scene.id.equals(id)) {
                return scene;
            }
        }
        return null;
    }
}
