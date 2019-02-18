<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">

<head>
    <title>Lab</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <link rel="stylesheet" type="text/css" media="all"
          href="https://cdnjs.cloudflare.com/ajax/libs/bulma/0.7.2/css/bulma.css"/>
    <link rel="stylesheet" type="text/css" media="all" href="../static/css/main.css" th:href="@{./css/main.css}"/>
    <link rel="stylesheet" type="text/css" media="all" href="../static/css/fontawesome.css"
          th:href="@{./css/fontawesome.css}"
    />
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.2.0/css/all.css">

    <style>
        body {
            padding-top: 50px;
        }
    </style>
</head>

<body class="layout-default">
<section class="hero is-fullheight is-medium doctor-container">
    <div class="columns is-centered">
        <div class="column is-four-fifths">
            <div class="box">
                <div class="has-text-centered">
                    <h2 class="is-size-3 has-text-weight-light">Lab Tests & Results</h2>
                    <p class="help is-danger">Kindly enter the data carefully</p>
                </div>
                <div class="card-content">
                    <div class="field is-horizontal">
                        <div class="field-label is-normal">
                            <label class="label">Patient:</label>
                        </div>
                        <div class="field-body">
                            <div class="field is-expanded">
                                <div class="field has-addons">
                                    <p class="control">
                                        <a class="button is-primary has-background-primary  is-medium">
                                            Name:
                                        </a>
                                    </p>
                                    <p class="control is-expanded">
                                        <input class="input is-primary has-text-primary is-medium" type="text"
                                               value="Patient Name" readonly>
                                    </p>
                                </div>
                            </div>
                            <div class="field is-expanded">
                                <div class="field has-addons">
                                    <p class="control">
                                        <a class="button is-primary has-background-primary  is-medium">
                                            Sex:
                                        </a>
                                    </p>
                                    <p class="control is-expanded">
                                        <input class="input is-primary has-text-primary is-medium" type="text"
                                               value="Female" readonly>
                                    </p>
                                </div>
                            </div>
                            <div class="field is-expanded">
                                <div class="field has-addons">
                                    <p class="control">
                                        <a class="button is-primary has-background-primary  is-medium">
                                            Id:
                                        </a>
                                    </p>
                                    <p class="control is-expanded">
                                        <input class="input is-primary has-text-primary is-medium" type="number"
                                               value="1234" readonly>
                                    </p>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="field is-horizontal">
                        <div class="field-label is-normal">
                            <label class="label">Details:</label>
                        </div>
                        <div class="field-body">
                            <div class="field is-expanded">
                                <div class="field has-addons">
                                    <p class="control">
                                        <a class="button is-primary">
                                            Age
                                        </a>
                                    </p>
                                    <p class="control is-expanded has-icons-right">
                                        <input class="input is-primary has-text-primary" type="number" value="18"
                                               readonly>
                                        <span class="icon is-small is-right">
                                                Yrs
                                            </span>
                                    </p>
                                </div>
                            </div>
                            <div class="field is-expanded">
                                <div class="field has-addons">
                                    <p class="control">
                                        <a class="button is-primary">
                                            Weight
                                        </a>
                                    </p>
                                    <p class="control is-expanded has-icons-right">
                                        <input class="input is-primary has-text-primary" type="number" value="18"
                                               readonly>
                                        <span class="icon is-small is-right is-4-widescreen">
                                                Kg
                                            </span>
                                    </p>
                                </div>
                            </div>
                            <div class="field is-expanded">
                                <div class="field has-addons">
                                    <p class="control">
                                        <a class="button is-primary">
                                            height
                                        </a>
                                    </p>
                                    <p class="control is-expanded has-icons-right">
                                        <input class="input is-primary has-text-primary" type="number" value="18"
                                               readonly>
                                        <span class="icon is-small is-right">
                                                M
                                            </span>
                                    </p>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="field is-horizontal">
                        <div class="field-label is-normal">
                        </div>
                        <div class="field-body">
                            <div class="field is-expanded">
                                <div class="field has-addons">
                                    <p class="control">
                                        <a class="button is-primary">
                                            BMI
                                        </a>
                                    </p>
                                    <p class="control is-expanded has-icons-right">
                                        <input class="input is-primary has-text-primary" type="number" value="18"
                                               readonly>
                                        <span class="icon is-small is-right">
                                                kg/m
                                            </span>
                                    </p>
                                </div>
                            </div>
                            <div class="field is-expanded">
                                <div class="field has-addons">
                                    <p class="control">
                                        <a class="button is-primary">
                                            Temperature
                                        </a>
                                    </p>
                                    <p class="control is-expanded has-icons-right">
                                        <input class="input is-primary has-text-primary" type="number" value="18"
                                               readonly>
                                        <span class="icon is-small is-right">
                                                Deg
                                            </span>
                                    </p>
                                </div>
                            </div>
                        </div>
                    </div>

                    <hr>

                    <div class="field is-horizontal">
                        <div class="field-label is-normal">
                            <label class="label">Test:</label>
                        </div>

                        <div class="field-body">
                            <div class="field">
                                <p class="control is-expanded">
                                    <textarea class="textarea is-primary has-text-black test-type"
                                              placeholder="Required Test" readonly></textarea>
                                </p>
                            </div>
                        </div>
                        <div class="field-label is-normal">
                            <label class="label">Results:</label>
                        </div>
                        <div class="field-body">
                            <div class="field">
                                <p class="control is-expanded is-primary">
                                    <textarea class="textarea is-primary has-text-black test-results"
                                              placeholder="Test Results"></textarea>
                                </p>
                            </div>
                        </div>
                    </div>

                    <hr>

                    <div class="field is-horizontal">
                        <div class="field-label is-normal">
                            <label class="label">Lab Technician:</label>
                        </div>
                        <div class="field-body">
                            <div class="field">
                                <p class="control is-expanded">
                                    <input class="input is-primary has-text-primary" type="text" value="Lab Tech's Name"
                                           readonly>
                                </p>
                            </div>
                        </div>
                    </div>

                    <div class="field is-horizontal">
                        <div class="field-label">
                            <!-- Left empty for spacing -->
                        </div>
                        <div class="field-body">
                            <div class="field">
                                <div class="control">
                                    <button class="button is-primary" >
                                        Submit Lab Report
                                    </button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
</body>

</html>