package uk.ac.bris.cs.bristolstreetview;

public class CameraCommand {

    private String name;
    private String id;
    private Parameters parameters;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Parameters getParameters() {
        return parameters;
    }

    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
    }
}


class Parameters {

    private Options options;
    private String[] fileUrls;

    public Options getOptions() {
        return options;
    }

    public void setOptions(Options options) {
        this.options = options;
    }

    public String[] getFileUrls() {
        return fileUrls;
    }

    public void setFileUrls(String[] fileUrls) {
        this.fileUrls = fileUrls;
    }
}


class Options {

    private int _shutterVolume;


    public int get_shutterVolume() {
        return _shutterVolume;
    }

    public void set_shutterVolume(int _shutterVolume) {
        this._shutterVolume = _shutterVolume;
    }

}
