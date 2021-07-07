package com.testvagrant.ekam.drivers.models;

import lombok.*;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class BrowserConfig {

  @Builder.Default private DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

  @Builder.Default private List<String> arguments = new ArrayList<>();

  @Builder.Default private Map<String, Object> preferences = new HashMap<>();

  @Builder.Default private List<String> extensions = new ArrayList<>();

  @Builder.Default private Map<String, Object> experimentalOptions = new HashMap<>();
}
